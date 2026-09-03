package com.faendir.awscdkkt.generated.services.redshift

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.redshift.CfnSnapshotSchedule
import software.amazon.awscdk.services.redshift.CfnSnapshotScheduleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSnapshotSchedule(
  id: String,
  props: CfnSnapshotScheduleProps,
  initializer: @AwsCdkDsl CfnSnapshotSchedule.() -> Unit = {},
): CfnSnapshotSchedule = CfnSnapshotSchedule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSnapshotSchedule(id: String, initializer: @AwsCdkDsl CfnSnapshotSchedule.Builder.() -> Unit = {}): CfnSnapshotSchedule = CfnSnapshotSchedule.Builder.create(this, id).apply(initializer).build()
