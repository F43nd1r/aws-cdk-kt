package com.faendir.awscdkkt.generated.services.resourceexplorer2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociation
import software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDefaultViewAssociation(
  id: String,
  props: CfnDefaultViewAssociationProps,
  initializer: @AwsCdkDsl CfnDefaultViewAssociation.() -> Unit = {},
): CfnDefaultViewAssociation = CfnDefaultViewAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDefaultViewAssociation(id: String, initializer: @AwsCdkDsl
    CfnDefaultViewAssociation.Builder.() -> Unit = {}): CfnDefaultViewAssociation =
    CfnDefaultViewAssociation.Builder.create(this, id).apply(initializer).build()
