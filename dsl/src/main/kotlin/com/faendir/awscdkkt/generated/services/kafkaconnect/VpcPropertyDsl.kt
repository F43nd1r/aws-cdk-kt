package com.faendir.awscdkkt.generated.services.kafkaconnect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

@Generated
public fun buildVpcProperty(initializer: @AwsCdkDsl CfnConnector.VpcProperty.Builder.() -> Unit =
    {}): CfnConnector.VpcProperty = CfnConnector.VpcProperty.Builder().apply(initializer).build()
