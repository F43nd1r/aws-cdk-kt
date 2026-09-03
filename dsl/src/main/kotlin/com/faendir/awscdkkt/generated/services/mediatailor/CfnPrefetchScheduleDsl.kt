package com.faendir.awscdkkt.generated.services.mediatailor

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediatailor.CfnPrefetchSchedule
import software.amazon.awscdk.services.mediatailor.CfnPrefetchScheduleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPrefetchSchedule(
  id: String,
  props: CfnPrefetchScheduleProps,
  initializer: @AwsCdkDsl CfnPrefetchSchedule.() -> Unit = {},
): CfnPrefetchSchedule = CfnPrefetchSchedule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPrefetchSchedule(id: String, initializer: @AwsCdkDsl CfnPrefetchSchedule.Builder.() -> Unit = {}): CfnPrefetchSchedule = CfnPrefetchSchedule.Builder.create(this, id).apply(initializer).build()
