package com.faendir.awscdkkt.generated.services.inspector

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.ResourceProps
import software.amazon.awscdk.services.inspector.AssessmentTemplate
import software.constructs.Construct

@Generated
public fun Construct.assessmentTemplate(id: String, initializer: @AwsCdkDsl
    AssessmentTemplate.() -> Unit = {}): AssessmentTemplate = AssessmentTemplate(this,
    id).apply(initializer)

@Generated
public fun Construct.assessmentTemplate(
  id: String,
  props: ResourceProps,
  initializer: @AwsCdkDsl AssessmentTemplate.() -> Unit = {},
): AssessmentTemplate = AssessmentTemplate(this, id, props).apply(initializer)

@Generated
public fun Construct.buildAssessmentTemplate(id: String, initializer: @AwsCdkDsl
    AssessmentTemplate.Builder.() -> Unit = {}): AssessmentTemplate =
    AssessmentTemplate.Builder.create(this, id).apply(initializer).build()
