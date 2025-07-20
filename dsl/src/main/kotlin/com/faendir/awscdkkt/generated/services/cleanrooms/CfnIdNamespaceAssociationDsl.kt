package com.faendir.awscdkkt.generated.services.cleanrooms

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cleanrooms.CfnIdNamespaceAssociation
import software.amazon.awscdk.services.cleanrooms.CfnIdNamespaceAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnIdNamespaceAssociation(
  id: String,
  props: CfnIdNamespaceAssociationProps,
  initializer: @AwsCdkDsl CfnIdNamespaceAssociation.() -> Unit = {},
): CfnIdNamespaceAssociation = CfnIdNamespaceAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnIdNamespaceAssociation(id: String, initializer: @AwsCdkDsl CfnIdNamespaceAssociation.Builder.() -> Unit = {}): CfnIdNamespaceAssociation = CfnIdNamespaceAssociation.Builder.create(this, id).apply(initializer).build()
