package com.faendir.awscdkkt.generated.services.cloudwatch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CfnAlarm

@Generated
public fun buildWallClockWindowProperty(initializer: @AwsCdkDsl CfnAlarm.WallClockWindowProperty.Builder.() -> Unit = {}): CfnAlarm.WallClockWindowProperty = CfnAlarm.WallClockWindowProperty.Builder().apply(initializer).build()
