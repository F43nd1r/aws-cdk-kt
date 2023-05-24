package com.faendir.awscdkkt.generated.pipelines

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.pipelines.ManualApprovalStep
import software.amazon.awscdk.pipelines.ManualApprovalStepProps

@Generated
public fun manualApprovalStep(id: String): ManualApprovalStep = ManualApprovalStep(id)

@Generated
public fun manualApprovalStep(id: String, props: ManualApprovalStepProps): ManualApprovalStep =
    ManualApprovalStep(id, props)

@Generated
public fun buildManualApprovalStep(id: String, initializer: @AwsCdkDsl
    ManualApprovalStep.Builder.() -> Unit): ManualApprovalStep =
    ManualApprovalStep.Builder.create(id).apply(initializer).build()
