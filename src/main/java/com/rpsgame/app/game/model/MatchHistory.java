package com.rpsgame.app.game.model;

import java.util.ArrayList;
import java.util.List;

public class MatchHistory {
    public static List<PlayerModel> historyPlayers = new ArrayList<>();
    public static List<ScoreModel> historyScore = new ArrayList<>();
    public static List<RoundModel> historyRound = new ArrayList<>();

    public static void addHistoryPlayers(PlayerModel player){
        historyPlayers.add(player);
    }

    public static List<PlayerModel> getHistoryhPlayers() {
        return List.copyOf(historyPlayers);
    }

    public static void addHistoryScore(ScoreModel score){
        historyScore.add(score);
    }

    public static List<ScoreModel> getHistoryScore() {
        return List.copyOf(historyScore);
    }

    public static void addHistoryRound(RoundModel round){
        historyRound.add(round);
    }

    public static List<RoundModel> getHistoryRound() {
        return List.copyOf(historyRound);
    }
}
