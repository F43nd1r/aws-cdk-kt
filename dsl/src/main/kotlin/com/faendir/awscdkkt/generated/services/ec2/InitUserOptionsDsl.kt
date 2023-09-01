package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.InitUserOptions

@Generated
public fun buildInitUserOptions(initializer: @AwsCdkDsl InitUserOptions.Builder.() -> Unit = {}):
    InitUserOptions = InitUserOptions.Builder().apply(initializer).build()
