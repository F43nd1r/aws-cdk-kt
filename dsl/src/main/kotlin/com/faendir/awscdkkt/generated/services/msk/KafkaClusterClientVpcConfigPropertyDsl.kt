package com.faendir.awscdkkt.generated.services.msk

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnReplicator

@Generated
public fun buildKafkaClusterClientVpcConfigProperty(initializer: @AwsCdkDsl
    CfnReplicator.KafkaClusterClientVpcConfigProperty.Builder.() -> Unit = {}):
    CfnReplicator.KafkaClusterClientVpcConfigProperty =
    CfnReplicator.KafkaClusterClientVpcConfigProperty.Builder().apply(initializer).build()
