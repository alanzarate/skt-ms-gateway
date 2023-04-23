package com.ucb.bo.sktmsgateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class SktMsGatewayApplication

fun main(args: Array<String>) {
	runApplication<SktMsGatewayApplication>(*args)
}
