package com.faendir.awscdkkt.generated.services.notifications

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.notifications.CfnOrganizationalUnitAssociation
import software.amazon.awscdk.services.notifications.CfnOrganizationalUnitAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnOrganizationalUnitAssociation(
  id: String,
  props: CfnOrganizationalUnitAssociationProps,
  initializer: @AwsCdkDsl CfnOrganizationalUnitAssociation.() -> Unit = {},
): CfnOrganizationalUnitAssociation = CfnOrganizationalUnitAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnOrganizationalUnitAssociation(id: String, initializer: @AwsCdkDsl CfnOrganizationalUnitAssociation.Builder.() -> Unit = {}): CfnOrganizationalUnitAssociation = CfnOrganizationalUnitAssociation.Builder.create(this, id).apply(initializer).build()
