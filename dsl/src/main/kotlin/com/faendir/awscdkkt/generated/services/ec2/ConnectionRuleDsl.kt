package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.ConnectionRule

@Generated
public fun buildConnectionRule(initializer: @AwsCdkDsl ConnectionRule.Builder.() -> Unit = {}):
    ConnectionRule = ConnectionRule.Builder().apply(initializer).build()
