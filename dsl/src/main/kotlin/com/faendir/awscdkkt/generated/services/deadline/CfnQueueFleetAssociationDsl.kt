package com.faendir.awscdkkt.generated.services.deadline

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.deadline.CfnQueueFleetAssociation
import software.amazon.awscdk.services.deadline.CfnQueueFleetAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnQueueFleetAssociation(
  id: String,
  props: CfnQueueFleetAssociationProps,
  initializer: @AwsCdkDsl CfnQueueFleetAssociation.() -> Unit = {},
): CfnQueueFleetAssociation = CfnQueueFleetAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnQueueFleetAssociation(id: String, initializer: @AwsCdkDsl CfnQueueFleetAssociation.Builder.() -> Unit = {}): CfnQueueFleetAssociation = CfnQueueFleetAssociation.Builder.create(this, id).apply(initializer).build()
