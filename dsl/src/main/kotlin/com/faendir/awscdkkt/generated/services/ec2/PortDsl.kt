package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.Port

@Generated
public fun buildPort(initializer: @AwsCdkDsl Port.Builder.() -> Unit): Port =
    Port.Builder.create().apply(initializer).build()
