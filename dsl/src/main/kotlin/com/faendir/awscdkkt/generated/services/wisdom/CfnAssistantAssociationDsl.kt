package com.faendir.awscdkkt.generated.services.wisdom

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.wisdom.CfnAssistantAssociation
import software.amazon.awscdk.services.wisdom.CfnAssistantAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAssistantAssociation(
  id: String,
  props: CfnAssistantAssociationProps,
  initializer: @AwsCdkDsl CfnAssistantAssociation.() -> Unit = {},
): CfnAssistantAssociation = CfnAssistantAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAssistantAssociation(id: String, initializer: @AwsCdkDsl
    CfnAssistantAssociation.Builder.() -> Unit = {}): CfnAssistantAssociation =
    CfnAssistantAssociation.Builder.create(this, id).apply(initializer).build()
