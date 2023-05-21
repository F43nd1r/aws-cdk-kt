package com.faendir.awscdkkt.services.backup

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.backup.CfnBackupSelection
import software.amazon.awscdk.services.backup.CfnBackupSelectionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnBackupSelection(
  id: String,
  props: CfnBackupSelectionProps,
  initializer: CfnBackupSelection.() -> Unit = {},
): CfnBackupSelection = CfnBackupSelection(this, id, props).apply(initializer)
