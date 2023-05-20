@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnCrawler

public fun jdbcTargetProperty(initializer: CfnCrawler.JdbcTargetProperty.Builder.() -> Unit):
    CfnCrawler.JdbcTargetProperty =
    CfnCrawler.JdbcTargetProperty.builder().apply(initializer).build()
