package com.faendir.awscdkkt.services.identitystore

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.identitystore.CfnGroupMembership

@Generated
public fun memberIdProperty(initializer: CfnGroupMembership.MemberIdProperty.Builder.() -> Unit =
    {}): CfnGroupMembership.MemberIdProperty =
    CfnGroupMembership.MemberIdProperty.builder().apply(initializer).build()
