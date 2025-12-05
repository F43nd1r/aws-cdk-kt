package com.faendir.awscdkkt.generated.services.devopsagent

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.devopsagent.CfnAssociation
import software.amazon.awscdk.services.devopsagent.CfnAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAssociation(
  id: String,
  props: CfnAssociationProps,
  initializer: @AwsCdkDsl CfnAssociation.() -> Unit = {},
): CfnAssociation = CfnAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAssociation(id: String, initializer: @AwsCdkDsl CfnAssociation.Builder.() -> Unit = {}): CfnAssociation = CfnAssociation.Builder.create(this, id).apply(initializer).build()
