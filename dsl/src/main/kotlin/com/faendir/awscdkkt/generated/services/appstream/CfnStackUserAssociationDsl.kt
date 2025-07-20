package com.faendir.awscdkkt.generated.services.appstream

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appstream.CfnStackUserAssociation
import software.amazon.awscdk.services.appstream.CfnStackUserAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStackUserAssociation(
  id: String,
  props: CfnStackUserAssociationProps,
  initializer: @AwsCdkDsl CfnStackUserAssociation.() -> Unit = {},
): CfnStackUserAssociation = CfnStackUserAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnStackUserAssociation(id: String, initializer: @AwsCdkDsl CfnStackUserAssociation.Builder.() -> Unit = {}): CfnStackUserAssociation = CfnStackUserAssociation.Builder.create(this, id).apply(initializer).build()
