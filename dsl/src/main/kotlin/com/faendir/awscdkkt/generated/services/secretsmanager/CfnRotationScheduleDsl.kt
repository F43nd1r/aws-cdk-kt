package com.faendir.awscdkkt.generated.services.secretsmanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule
import software.amazon.awscdk.services.secretsmanager.CfnRotationScheduleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRotationSchedule(
  id: String,
  props: CfnRotationScheduleProps,
  initializer: @AwsCdkDsl CfnRotationSchedule.() -> Unit = {},
): CfnRotationSchedule = CfnRotationSchedule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRotationSchedule(id: String, initializer: @AwsCdkDsl
    CfnRotationSchedule.Builder.() -> Unit = {}): CfnRotationSchedule =
    CfnRotationSchedule.Builder.create(this, id).apply(initializer).build()
