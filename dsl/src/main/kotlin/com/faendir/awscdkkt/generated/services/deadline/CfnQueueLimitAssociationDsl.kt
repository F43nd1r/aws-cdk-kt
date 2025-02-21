package com.faendir.awscdkkt.generated.services.deadline

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.deadline.CfnQueueLimitAssociation
import software.amazon.awscdk.services.deadline.CfnQueueLimitAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnQueueLimitAssociation(
  id: String,
  props: CfnQueueLimitAssociationProps,
  initializer: @AwsCdkDsl CfnQueueLimitAssociation.() -> Unit = {},
): CfnQueueLimitAssociation = CfnQueueLimitAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnQueueLimitAssociation(id: String, initializer: @AwsCdkDsl
    CfnQueueLimitAssociation.Builder.() -> Unit = {}): CfnQueueLimitAssociation =
    CfnQueueLimitAssociation.Builder.create(this, id).apply(initializer).build()
