package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.SecurityGroup
import software.amazon.awscdk.services.ec2.SecurityGroupProps
import software.constructs.Construct

@Generated
public fun Construct.securityGroup(id: String, props: SecurityGroupProps): SecurityGroup =
    SecurityGroup(this, id, props)

@Generated
public fun Construct.securityGroup(
  id: String,
  props: SecurityGroupProps,
  initializer: @AwsCdkDsl SecurityGroup.() -> Unit,
): SecurityGroup = SecurityGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildSecurityGroup(id: String, initializer: @AwsCdkDsl
    SecurityGroup.Builder.() -> Unit): SecurityGroup = SecurityGroup.Builder.create(this,
    id).apply(initializer).build()
