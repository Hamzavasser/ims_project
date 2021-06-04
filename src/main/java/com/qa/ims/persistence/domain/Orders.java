package com.qa.ims.persistence.domain;


public class Orders {
	private Long orderId;
	private Long customId;
	private Long itemId;
	
	public Orders(Long orderId, Long customId) {
		this.orderId = orderId;
		this.customId = customId;
	}
	
	public Orders(Long orderId, Long customId, Long itemId) {
		this.orderId = orderId;
		this.customId = customId;
		this.itemId = itemId;
	}

	public Long getOrderId() {
		return orderId;
	}
	
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	
	public Long getCustomId() {
		return customId;
	}
	
	public void setCustomId(Long customId) {
		this.customId = customId;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", customId=" + customId + "]";
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orders other = (Orders) obj;
		if (getCustomId() == null) {
			if (other.getOrderId() != null)
				return false;
		} else if (!getCustomId().equals(other.getCustomId()))
			return false;
		if (orderId == null) {
			if (other.orderId != null)
				return false;
		} else if (!orderId.equals(other.orderId))
			return false;
		if (orderId == null) {
			if (other.orderId != null)
				return false;
		} else if (!orderId.equals(other.orderId))
			return false;
		return true;
	}
	
	
}
