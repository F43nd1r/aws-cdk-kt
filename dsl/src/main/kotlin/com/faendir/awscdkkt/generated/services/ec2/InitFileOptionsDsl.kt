package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.InitFileOptions

@Generated
public fun buildInitFileOptions(initializer: @AwsCdkDsl InitFileOptions.Builder.() -> Unit = {}):
    InitFileOptions = InitFileOptions.Builder().apply(initializer).build()
