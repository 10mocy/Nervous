package jp.nrsy.mc.nervous.utils.discord;

import discord4j.core.DiscordClientBuilder;
import discord4j.core.GatewayDiscordClient;

public class DiscordClient {
  private GatewayDiscordClient client;

  public DiscordClient(String token) {
    this.client = DiscordClientBuilder.create(token).build().login().block();
  }
}
