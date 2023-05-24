package com.faendir.awscdkkt.generated.services.backup

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.backup.CfnBackupSelection
import software.amazon.awscdk.services.backup.CfnBackupSelectionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnBackupSelection(id: String, props: CfnBackupSelectionProps):
    CfnBackupSelection = CfnBackupSelection(this, id, props)

@Generated
public fun Construct.cfnBackupSelection(
  id: String,
  props: CfnBackupSelectionProps,
  initializer: @AwsCdkDsl CfnBackupSelection.() -> Unit,
): CfnBackupSelection = CfnBackupSelection(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnBackupSelection(id: String, initializer: @AwsCdkDsl
    CfnBackupSelection.Builder.() -> Unit): CfnBackupSelection =
    CfnBackupSelection.Builder.create(this, id).apply(initializer).build()
