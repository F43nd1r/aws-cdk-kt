package com.faendir.awscdkkt.generated.services.servicecatalog

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociation
import software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTagOptionAssociation(id: String, props: CfnTagOptionAssociationProps):
    CfnTagOptionAssociation = CfnTagOptionAssociation(this, id, props)

@Generated
public fun Construct.cfnTagOptionAssociation(
  id: String,
  props: CfnTagOptionAssociationProps,
  initializer: @AwsCdkDsl CfnTagOptionAssociation.() -> Unit,
): CfnTagOptionAssociation = CfnTagOptionAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTagOptionAssociation(id: String, initializer: @AwsCdkDsl
    CfnTagOptionAssociation.Builder.() -> Unit): CfnTagOptionAssociation =
    CfnTagOptionAssociation.Builder.create(this, id).apply(initializer).build()
