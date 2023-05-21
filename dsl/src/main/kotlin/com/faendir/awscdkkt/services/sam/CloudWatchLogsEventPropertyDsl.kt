package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction

@Generated
public
    fun cloudWatchLogsEventProperty(initializer: CfnFunction.CloudWatchLogsEventProperty.Builder.() -> Unit
    = {}): CfnFunction.CloudWatchLogsEventProperty =
    CfnFunction.CloudWatchLogsEventProperty.builder().apply(initializer).build()
