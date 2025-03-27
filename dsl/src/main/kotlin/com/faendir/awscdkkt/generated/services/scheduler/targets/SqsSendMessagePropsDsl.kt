package com.faendir.awscdkkt.generated.services.scheduler.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.targets.SqsSendMessageProps

@Generated
public fun buildSqsSendMessageProps(initializer: @AwsCdkDsl SqsSendMessageProps.Builder.() -> Unit =
    {}): SqsSendMessageProps = SqsSendMessageProps.Builder().apply(initializer).build()
