package com.faendir.awscdkkt.generated.services.elasticloadbalancing

import javax.`annotation`.Generated
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.Port
import software.amazon.awscdk.services.elasticloadbalancing.ListenerPort

@Generated
public fun listenerPort(securityGroup: ISecurityGroup, defaultPort: Port): ListenerPort =
    ListenerPort(securityGroup, defaultPort)
