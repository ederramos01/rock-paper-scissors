package com.rps.app.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ScoreModelTest {
    ScoreModel scoreModel = new ScoreModel();
    
    @Test
    void testGetP1Score() {
        scoreModel.updateP1Score();
        scoreModel.updateP1Score();
        scoreModel.updateRoundNumber();
        scoreModel.updateRoundNumber();

        assertEquals(2, scoreModel.getP1Score());
    }

    @Test
    void testRoundNumber() {
        scoreModel.updateRoundNumber();
        scoreModel.updateRoundNumber();

        assertEquals(2, scoreModel.getRoundNumber());
    }

    @Test
    void testGestScoreList() {
        assertEquals(2, scoreModel.getScoreList().size());
    }
}
