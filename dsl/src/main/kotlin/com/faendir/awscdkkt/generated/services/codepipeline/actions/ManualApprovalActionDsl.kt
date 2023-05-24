package com.faendir.awscdkkt.generated.services.codepipeline.actions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.ManualApprovalAction
import software.amazon.awscdk.services.codepipeline.actions.ManualApprovalActionProps

@Generated
public fun manualApprovalAction(props: ManualApprovalActionProps): ManualApprovalAction =
    ManualApprovalAction(props)

@Generated
public fun buildManualApprovalAction(initializer: @AwsCdkDsl
    ManualApprovalAction.Builder.() -> Unit): ManualApprovalAction =
    ManualApprovalAction.Builder.create().apply(initializer).build()
