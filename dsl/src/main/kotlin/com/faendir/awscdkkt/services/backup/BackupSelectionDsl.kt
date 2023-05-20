@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.backup

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.backup.BackupSelection
import software.amazon.awscdk.services.backup.BackupSelectionProps
import software.constructs.Construct

public fun Construct.backupSelection(
  id: String,
  props: BackupSelectionProps,
  initializer: BackupSelection.() -> Unit = {},
): BackupSelection = BackupSelection(this, id, props).apply(initializer)
