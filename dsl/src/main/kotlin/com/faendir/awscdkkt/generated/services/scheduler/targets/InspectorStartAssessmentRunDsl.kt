package com.faendir.awscdkkt.generated.services.scheduler.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.inspector.IAssessmentTemplate
import software.amazon.awscdk.services.scheduler.targets.InspectorStartAssessmentRun

@Generated
public fun buildInspectorStartAssessmentRun(template: IAssessmentTemplate, initializer: @AwsCdkDsl
    InspectorStartAssessmentRun.Builder.() -> Unit = {}): InspectorStartAssessmentRun =
    InspectorStartAssessmentRun.Builder.create(template).apply(initializer).build()
