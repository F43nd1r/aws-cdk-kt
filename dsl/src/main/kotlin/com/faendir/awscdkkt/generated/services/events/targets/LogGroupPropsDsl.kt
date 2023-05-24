package com.faendir.awscdkkt.generated.services.events.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.LogGroupProps

@Generated
public fun buildLogGroupProps(initializer: @AwsCdkDsl LogGroupProps.Builder.() -> Unit):
    LogGroupProps = LogGroupProps.Builder().apply(initializer).build()
