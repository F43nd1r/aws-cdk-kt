package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnCrawler

@Generated
public fun jdbcTargetProperty(initializer: CfnCrawler.JdbcTargetProperty.Builder.() -> Unit = {}):
    CfnCrawler.JdbcTargetProperty =
    CfnCrawler.JdbcTargetProperty.builder().apply(initializer).build()
