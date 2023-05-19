@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnCrawler

public fun jdbcTargetProperty(initializer: CfnCrawler.JdbcTargetProperty.Builder.() -> Unit):
    CfnCrawler.JdbcTargetProperty =
    CfnCrawler.JdbcTargetProperty.builder().apply(initializer).build()
