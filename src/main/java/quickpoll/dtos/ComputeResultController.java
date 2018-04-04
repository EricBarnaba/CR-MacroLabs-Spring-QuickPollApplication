package quickpoll.dtos;

import quickpoll.io.zipcoder.tc_spring_poll_application.domain.Vote;
import quickpoll.io.zipcoder.tc_spring_poll_application.repositories.VoteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
public class ComputeResultController {
    @Inject
    private VoteRepository voteRepository;

    @RequestMapping(value = "/computeresult", method = RequestMethod.GET)
    public ResponseEntity<?> computeResult(@RequestParam Long pollId) {
        VoteResult voteResult = new VoteResult();
        Iterable<Vote> allVotes = voteRepository.findVotesByPoll(pollId);

        //TODO: count votes
//        for(Vote v : allVotes){
//
//        }
        voteResult.setTotalVotes(200);

        return new ResponseEntity<VoteResult>(voteResult, HttpStatus.OK);
    }
}
