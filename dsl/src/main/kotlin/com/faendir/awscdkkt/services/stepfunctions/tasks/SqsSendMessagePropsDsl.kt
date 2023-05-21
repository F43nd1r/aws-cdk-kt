package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.SqsSendMessageProps

@Generated
public fun sqsSendMessageProps(initializer: SqsSendMessageProps.Builder.() -> Unit = {}):
    SqsSendMessageProps = SqsSendMessageProps.builder().apply(initializer).build()
