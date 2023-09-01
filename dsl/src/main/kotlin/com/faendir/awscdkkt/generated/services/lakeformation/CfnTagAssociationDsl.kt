package com.faendir.awscdkkt.generated.services.lakeformation

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lakeformation.CfnTagAssociation
import software.amazon.awscdk.services.lakeformation.CfnTagAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTagAssociation(
  id: String,
  props: CfnTagAssociationProps,
  initializer: @AwsCdkDsl CfnTagAssociation.() -> Unit = {},
): CfnTagAssociation = CfnTagAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTagAssociation(id: String, initializer: @AwsCdkDsl
    CfnTagAssociation.Builder.() -> Unit = {}): CfnTagAssociation =
    CfnTagAssociation.Builder.create(this, id).apply(initializer).build()
