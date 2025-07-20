package com.faendir.awscdkkt.generated.services.backup

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.backup.CfnRestoreTestingSelection
import software.amazon.awscdk.services.backup.CfnRestoreTestingSelectionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRestoreTestingSelection(
  id: String,
  props: CfnRestoreTestingSelectionProps,
  initializer: @AwsCdkDsl CfnRestoreTestingSelection.() -> Unit = {},
): CfnRestoreTestingSelection = CfnRestoreTestingSelection(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRestoreTestingSelection(id: String, initializer: @AwsCdkDsl CfnRestoreTestingSelection.Builder.() -> Unit = {}): CfnRestoreTestingSelection = CfnRestoreTestingSelection.Builder.create(this, id).apply(initializer).build()
