package com.faendir.awscdkkt.generated.services.backup

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.backup.BackupPlan
import software.amazon.awscdk.services.backup.BackupPlanProps
import software.constructs.Construct

@Generated
public fun Construct.backupPlan(id: String, initializer: @AwsCdkDsl BackupPlan.() -> Unit = {}): BackupPlan = BackupPlan(this, id).apply(initializer)

@Generated
public fun Construct.backupPlan(
  id: String,
  props: BackupPlanProps,
  initializer: @AwsCdkDsl BackupPlan.() -> Unit = {},
): BackupPlan = BackupPlan(this, id, props).apply(initializer)

@Generated
public fun Construct.buildBackupPlan(id: String, initializer: @AwsCdkDsl BackupPlan.Builder.() -> Unit = {}): BackupPlan = BackupPlan.Builder.create(this, id).apply(initializer).build()
