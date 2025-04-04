package com.faendir.awscdkkt.generated.services.codepipeline.actions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.InspectorSourceCodeScanAction

@Generated
public fun buildInspectorSourceCodeScanAction(initializer: @AwsCdkDsl
    InspectorSourceCodeScanAction.Builder.() -> Unit = {}): InspectorSourceCodeScanAction =
    InspectorSourceCodeScanAction.Builder.create().apply(initializer).build()
