package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociation
import software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEnclaveCertificateIamRoleAssociation(id: String,
    props: CfnEnclaveCertificateIamRoleAssociationProps): CfnEnclaveCertificateIamRoleAssociation =
    CfnEnclaveCertificateIamRoleAssociation(this, id, props)

@Generated
public fun Construct.cfnEnclaveCertificateIamRoleAssociation(
  id: String,
  props: CfnEnclaveCertificateIamRoleAssociationProps,
  initializer: @AwsCdkDsl CfnEnclaveCertificateIamRoleAssociation.() -> Unit,
): CfnEnclaveCertificateIamRoleAssociation = CfnEnclaveCertificateIamRoleAssociation(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnEnclaveCertificateIamRoleAssociation(id: String,
    initializer: @AwsCdkDsl CfnEnclaveCertificateIamRoleAssociation.Builder.() -> Unit):
    CfnEnclaveCertificateIamRoleAssociation =
    CfnEnclaveCertificateIamRoleAssociation.Builder.create(this, id).apply(initializer).build()
