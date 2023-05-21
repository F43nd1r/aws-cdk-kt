package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnCluster

@Generated
public fun firehoseProperty(initializer: CfnCluster.FirehoseProperty.Builder.() -> Unit = {}):
    CfnCluster.FirehoseProperty = CfnCluster.FirehoseProperty.builder().apply(initializer).build()
