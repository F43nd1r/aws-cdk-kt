@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.backup

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.backup.CfnBackupSelection
import software.amazon.awscdk.services.backup.CfnBackupSelectionProps
import software.constructs.Construct

public fun Construct.cfnBackupSelection(
  id: String,
  props: CfnBackupSelectionProps,
  initializer: CfnBackupSelection.() -> Unit = {},
): CfnBackupSelection = CfnBackupSelection(this, id, props).apply(initializer)
