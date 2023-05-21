package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CompositeAlarmProps

@Generated
public fun compositeAlarmProps(initializer: CompositeAlarmProps.Builder.() -> Unit = {}):
    CompositeAlarmProps = CompositeAlarmProps.builder().apply(initializer).build()
