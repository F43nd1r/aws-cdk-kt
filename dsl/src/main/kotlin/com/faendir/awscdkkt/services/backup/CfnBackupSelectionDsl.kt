@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
