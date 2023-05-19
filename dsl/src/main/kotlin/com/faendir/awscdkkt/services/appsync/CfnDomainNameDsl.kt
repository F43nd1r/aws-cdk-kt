@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnDomainName
import software.amazon.awscdk.services.appsync.CfnDomainNameProps
import software.constructs.Construct

public fun Construct.cfnDomainName(
  id: String,
  props: CfnDomainNameProps,
  initializer: CfnDomainName.() -> Unit = {},
): CfnDomainName = CfnDomainName(this, id, props).apply(initializer)
