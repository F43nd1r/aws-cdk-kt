package com.faendir.awscdkkt.services.sdb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sdb.CfnDomainProps

@Generated
public fun cfnDomainProps(initializer: CfnDomainProps.Builder.() -> Unit = {}): CfnDomainProps =
    CfnDomainProps.builder().apply(initializer).build()
