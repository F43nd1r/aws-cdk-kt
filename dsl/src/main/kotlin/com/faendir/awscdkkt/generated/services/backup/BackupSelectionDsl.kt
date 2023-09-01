package com.faendir.awscdkkt.generated.services.backup

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.backup.BackupSelection
import software.amazon.awscdk.services.backup.BackupSelectionProps
import software.constructs.Construct

@Generated
public fun Construct.backupSelection(
  id: String,
  props: BackupSelectionProps,
  initializer: @AwsCdkDsl BackupSelection.() -> Unit = {},
): BackupSelection = BackupSelection(this, id, props).apply(initializer)

@Generated
public fun Construct.buildBackupSelection(id: String, initializer: @AwsCdkDsl
    BackupSelection.Builder.() -> Unit = {}): BackupSelection = BackupSelection.Builder.create(this,
    id).apply(initializer).build()
