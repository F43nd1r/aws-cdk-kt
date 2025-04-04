package com.faendir.awscdkkt.generated.services.codepipeline.actions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.InspectorEcrImageScanAction

@Generated
public fun buildInspectorEcrImageScanAction(initializer: @AwsCdkDsl
    InspectorEcrImageScanAction.Builder.() -> Unit = {}): InspectorEcrImageScanAction =
    InspectorEcrImageScanAction.Builder.create().apply(initializer).build()
